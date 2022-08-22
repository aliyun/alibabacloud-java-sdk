// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListCommentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListCommentsResponseBodyResult result;

    public static ListCommentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommentsResponseBody self = new ListCommentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommentsResponseBody setResult(ListCommentsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListCommentsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListCommentsResponseBodyResultCommentVOList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CommentId")
        public String commentId;

        @NameInMap("Content")
        public String content;

        @NameInMap("CreateAt")
        public Long createAt;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("SenderNick")
        public String senderNick;

        public static ListCommentsResponseBodyResultCommentVOList build(java.util.Map<String, ?> map) throws Exception {
            ListCommentsResponseBodyResultCommentVOList self = new ListCommentsResponseBodyResultCommentVOList();
            return TeaModel.build(map, self);
        }

        public ListCommentsResponseBodyResultCommentVOList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListCommentsResponseBodyResultCommentVOList setCommentId(String commentId) {
            this.commentId = commentId;
            return this;
        }
        public String getCommentId() {
            return this.commentId;
        }

        public ListCommentsResponseBodyResultCommentVOList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListCommentsResponseBodyResultCommentVOList setCreateAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }
        public Long getCreateAt() {
            return this.createAt;
        }

        public ListCommentsResponseBodyResultCommentVOList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListCommentsResponseBodyResultCommentVOList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListCommentsResponseBodyResultCommentVOList setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListCommentsResponseBodyResultCommentVOList setSenderNick(String senderNick) {
            this.senderNick = senderNick;
            return this;
        }
        public String getSenderNick() {
            return this.senderNick;
        }

    }

    public static class ListCommentsResponseBodyResult extends TeaModel {
        @NameInMap("CommentVOList")
        public java.util.List<ListCommentsResponseBodyResultCommentVOList> commentVOList;

        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("PageTotal")
        public Integer pageTotal;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCommentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCommentsResponseBodyResult self = new ListCommentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCommentsResponseBodyResult setCommentVOList(java.util.List<ListCommentsResponseBodyResultCommentVOList> commentVOList) {
            this.commentVOList = commentVOList;
            return this;
        }
        public java.util.List<ListCommentsResponseBodyResultCommentVOList> getCommentVOList() {
            return this.commentVOList;
        }

        public ListCommentsResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListCommentsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListCommentsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}

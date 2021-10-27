// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListCommentsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 调用查询弹幕消息列表的返回结果。
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
        // 应用ID。
        @NameInMap("AppId")
        public String appId;

        // 弹幕消息的唯一ID标识。
        @NameInMap("CommentId")
        public String commentId;

        // 弹幕消息的内容。
        @NameInMap("Content")
        public String content;

        // 弹幕消息的创建时间，Unix时间戳，单位：毫秒。
        @NameInMap("CreateAt")
        public Long createAt;

        // 扩展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 房间ID。
        @NameInMap("RoomId")
        public String roomId;

        // 弹幕消息的发送者ID标识。
        @NameInMap("SenderId")
        public String senderId;

        // 弹幕消息发送者的昵称。
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
        // 弹幕消息列表。
        @NameInMap("CommentVOList")
        public java.util.List<ListCommentsResponseBodyResultCommentVOList> commentVOList;

        // 是否还有下一页数据。true表示还有，false表示没有。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 分页查询弹幕消息列表的总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 弹幕消息的总数。
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

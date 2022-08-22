// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteCommentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CommentIdList")
    public java.util.List<String> commentIdList;

    @NameInMap("RoomId")
    public String roomId;

    @NameInMap("UserId")
    public String userId;

    public static DeleteCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCommentRequest self = new DeleteCommentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCommentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteCommentRequest setCommentIdList(java.util.List<String> commentIdList) {
        this.commentIdList = commentIdList;
        return this;
    }
    public java.util.List<String> getCommentIdList() {
        return this.commentIdList;
    }

    public DeleteCommentRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public DeleteCommentRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
